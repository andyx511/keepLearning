import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.InputStreamEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.dom4j.Document;
import org.dom4j.io.SAXReader;
import 线程池.MyCallable;

import java.io.ByteArrayInputStream;
import java.io.Reader;
import java.io.StringReader;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.locks.AbstractQueuedSynchronizer;


/**
 * 这段代码在Java8中能正常运行，但是会在Java13中会抛出异常
 */
public class Main {

    public static void main(String[] args) throws Exception {
        String soap11 = "<soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:web=\"http://webxml.com.cn/\">"
                + "<soapenv:Header/>"
                + "<soapenv:Body>"
                +    "<web:toTraditionalChinese>"
                +      "<web:sText>倾城</web:sText>"
                +    "</web:toTraditionalChinese>"
                + "</soapenv:Body>"
                + "</soapenv:Envelope>";
        String soap12 = "<soapenv:Envelope xmlns:soapenv=\"http://www.w3.org/2003/05/soap-envelope\" xmlns:web=\"http://webxml.com.cn/\">"
                + "<soapenv:Header/>"
                + "<soapenv:Body>"
                +    "<web:toTraditionalChinese>"
                +      "<web:sText>大学</web:sText>"
                +    "</web:toTraditionalChinese>"
                + "</soapenv:Body>"
                + "</soapenv:Envelope>";


        httpClient(soap11);
        httpClient(soap12);
    }
    private static String urlWsdl = "http://www.webxml.com.cn/WebServices/TraditionalSimplifiedWebService.asmx?wsdl";
    private static String targetNamespace = "http://webxml.com.cn/";
    public static void httpClient(String soap) {
        try {
            CloseableHttpClient httpClient = HttpClients.createDefault();
            HttpPost httpPost = new HttpPost(urlWsdl);
            httpPost.setHeader("Content-Type", "text/xml;charset=UTF-8");
            httpPost.setHeader("SOAPAction", targetNamespace + "toTraditionalChinese");
            InputStreamEntity entity = new InputStreamEntity(new ByteArrayInputStream(soap.getBytes()));
            httpPost.setEntity(entity);
            CloseableHttpResponse response = httpClient.execute(httpPost);
            if (response.getStatusLine().getStatusCode() == org.apache.http.HttpStatus.SC_OK) {
                HttpEntity responseEntity = response.getEntity();
                String back = EntityUtils.toString(responseEntity);
                System.out.println("httpClient返回soap：" + back);
                System.out.println("httpClient返回结果：" + parseResult(back));
            } else {
                System.out.println("HttpClinet返回状态码：" + response.getStatusLine().getStatusCode());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    private static String parseResult(String s) {
        String result = "";
        try {
            Reader file = new StringReader(s);
            SAXReader reader = new SAXReader();

            Map<String, String> map = new HashMap<String, String>();
            map.put("ns", "http://webxml.com.cn/");
            reader.getDocumentFactory().setXPathNamespaceURIs(map);
            Document dc = reader.read(file);
            result = dc.selectSingleNode("//ns:toTraditionalChineseResult").getText().trim();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

}
