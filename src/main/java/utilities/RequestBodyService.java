package utilities;

import com.jayway.jsonpath.DocumentContext;
import stepDef.BaseStep;

public class RequestBodyService extends BaseStep {
    public void setRequestBodyForComment(DocumentContext requestBody, String postId,String name, String email, String body){
   requestBody.set("postId", postId);
        requestBody.set("email", email);
        requestBody.set("name", name);
        requestBody.set("body", body);
        setRequestBodyJson(requestBody);

    }

    public void setCreateBodyForUser(DocumentContext requestBody, String userId, String id, String title,String body){
        requestBody.set("userId", userId);
        requestBody.set("id", id);
        requestBody.set("title", title);
        requestBody.set("body", body);
        setRequestBodyJson(requestBody);





    }



}



