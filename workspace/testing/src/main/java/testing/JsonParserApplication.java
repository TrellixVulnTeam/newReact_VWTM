package testing;

import java.text.ParseException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class JsonParserApplication {
    public static void main(String[] args) throws Exception {
        //JSON���� Parsing�� ���ڿ� ������
        String jsonStr = "{\"members\":["
                + "{\"name\":\"ȫ�浿\","
                + "\"email\":\"gildong@hong.com\","
                + "\"age\":\"25\""
                + "},"
                + "{\"name\":\"ȫ�漭\","
                + "\"email\":\"gilseo@hong.com\","
                + "\"age\":\"23\""
                + "}]}";

        try {
            JSONParser jsonParser = new JSONParser();
            JSONObject jsonObj = (JSONObject) jsonParser.parse(jsonStr);
            JSONArray memberArray = (JSONArray) jsonObj.get("members");

            System.out.println("=====Members=====");
            for(int i=0 ; i<memberArray.size() ; i++){
                JSONObject tempObj = (JSONObject) memberArray.get(i);
                System.out.println(""+(i+1)+"��° ����� �̸� : "+tempObj.get("name"));
                System.out.println(""+(i+1)+"��° ����� �̸��� : "+tempObj.get("email"));
                System.out.println(""+(i+1)+"��° ����� ���� : "+tempObj.get("age"));
                System.out.println("----------------------------");
            }

        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
