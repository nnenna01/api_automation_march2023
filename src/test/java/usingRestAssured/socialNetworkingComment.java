package usingRestAssured;

import io.restassured.http.ContentType;
import org.junit.Test;

import java.util.HashMap;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;
import static org.hamcrest.Matchers.is;

public class socialNetworkingComment {
    @Test
    public void getSpecificCommentForSocialNetworking(){
        given().contentType(ContentType.JSON).log().all().
        when().get("https://jsonplaceholder.typicode.com/comments/1").
                then().assertThat().statusCode(200).log().all().
//                then(). statusCode(200).log().all().
                body("name", is("id labore ex et quam laborum")).
                body("email",is("Eliseo@gardner.biz"));

    }
    @Test
    public void postANewCommentForsocialNetworking(){
        HashMap<String, String>RequestBodyForPost=new HashMap<>();
        RequestBodyForPost.put("id", "1");
        RequestBodyForPost.put("name","manNoDie");
        RequestBodyForPost.put("body","i am loving to give you some good ideas");
        RequestBodyForPost.put("email","Eliseo@gardner.biz");

        given().contentType(ContentType.JSON).log().all().body(RequestBodyForPost).
          when(). post("https://jsonplaceholder.typicode.com/comments").
                then().statusCode(201).log().all().

                body("name",is("manNoDie")).
                body("body",is("i am loving to give you some good ideas")).
                body("email",is("Eliseo@gardner.biz"));
    }
}
//You can also do this to assert:  then().assertThat().statusCode(200).log().all().