import com.sms.Sms;

import java.util.*;

public class client {

public static void main(String[] args)throws Exception{

        Sms s = new Sms();
        Map<String,String> map = new HashMap<String,String>();

        s.setApiKey("A40e3879f0345fe799c9037d096c59113");
        s.setSender("QQQQQQ");
        s.setBaseURL("https://alerts.solutionsinfini.co/api/v4/?");

        String dlr_url = "http://solutionsinfini.net/dlr/trigger.php?sent={sent}&delivered={delivered}&msgid={msgid}&sid={sid}&status={status}&reference={reference}&custom1={custom1}&custom2={custom2}";
        String callback = "http%3A%2F%2Fsolutionsinfini.net%2Fdlr%2Ftrigger.php%3Fclient_ip%3D%7Bclient_ip%7D%26host%3D%7Bhost%7D%26query_string%3D%7Bquery_string%7D%26user_agent%3D%7Buser_agent%7D%26browser%3D%7Bbrowser%7D%26browser_version%3D%7Bbrowser_version%7D%26browser_lang%3D%7Bbrowser_lang%7D%26browser_engine%3D%7Bbrowser_engine%7D%26resolution%3D%7Bresolution%7D%26platform%3D%7Bplatform%7D%26platform_version%3D%7Bplatform_version%7D%26device_type%3D%7Bdevice_type%7D%26device_brand%3D%7Bdevice_brand%7D%26device_version%3D%7Bdevice_version%7D%26device_model%3D%7Bdevice_model%7D%26touch_enabled%3D%7Btouch_enabled%7D%26latitude%3D%7Blatitude%7D%26longitude%3D%7Blongitude%7D%26country%3D%7Bcountry%7D%26region%3D%7Bregion%7D%26city%3D%7Bcity%7D%26created%3D%7Bcreated%7D%26mobile%3D%7Bmobile%7D%26os_code%3D%7Bos_code%7D";
        
        //optional parameters.    
        //map.put("dlrurl", dlr_url);
        //map.put("unicode", "1");
        //map.put("time","2017-05-30 01:21:00 PM");
        //map.put("custom", "22");
        //map.put("number_info", "1");

        //Advanced optional parameters.
        //map.put("port", "8223");
        map.put("format", "xml");
        //map.put("flash", "1");
        //map.put("callback", callback);
        //map.put("action","delete");
        //map.put("email","jaiswal.piyush@gmail.com");
        //map.put("attach","Users/piyush.j/Pictures/Screenshots/hello.png");

        //String xml="<?xml version='1.0' encoding='UTF-8'?><xmlapi><sender>QQQQQQ</sender><message>xml test</message><unicode>1</unicode><flash>1</flash><campaign>xml test</campaign><dlrURL><![CDATA[http://example.php?sent={sent}&delivered={delivered}&msgid={msgid}&sid={sid}&status={status}&reference={reference}&custom1={custom1}&custom2={custom2}&credits={credits}]]></dlrURL><sms><to>8553025156</to><custom>22</custom><custom1>99</custom1><custom2>988</custom2></sms><sms><to>9986970357</to><custom>229</custom><custom1>995</custom1><custom2>98</custom2></sms></xmlapi>";
        String json = "{   \"message\": \"test json\",   \"sms\": [{     \"to\": \"9535975360\",     \"msgid\": \"1\",     \"message\": \"test json\",     \"custom1\": \"11\",     \"custom2\": \"22\",     \"sender\": \"QQQQQQ\"   }, {     \"to\": \"9986970357\",     \"msgid\": \"2\",     \"custom1\": \"1\",     \"custom2\": \"2\"   }],   \"unicode\": 1,   \"flash\": 1,   \"dlrurl\": \"http://solutionsinfini.net/dlr/trigger.php?referenceid={reference}%26status={status}%26delivered={delivered}%26messageid={messageid}%26customid1={custom1}%26customid2={custom2}%26senttime={senttime}%26reference={reference}%26message={message}\" }";
        String str = s.sendSms("9934813451","hello",map);
        System.out.println(str);
    }
}