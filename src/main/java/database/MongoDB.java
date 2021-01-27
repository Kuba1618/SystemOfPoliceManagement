package database;

import com.mongodb.*;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

import java.net.UnknownHostException;
import java.util.Arrays;

public class MongoDB {
    public static MongoClient mongoClient;
    public static MongoDatabase database;
    public static DBCollection collection;



    public static void main(String[] args) throws UnknownHostException {
        mongoClient = new MongoClient(new MongoClientURI("mongodb://localhost:27017"));
        database = mongoClient.getDatabase("PoliceSystemManagment");
        MongoCollection<Document> collection = database.getCollection("Users");
        Document document = new Document("name", "Café Con Leche")
                .append("contact", new Document("phone", "228-555-0149")
                        .append("email", "cafeconleche@example.com")
                        .append("location",Arrays.asList(-73.92502, 40.8279556)))
                .append("stars", 3)
                .append("categories", Arrays.asList("Bakery", "Coffee", "Pastries"));

        collection.insertOne(document);
        //DBObject query = new BasicDBObject("XDD",5678);
        //DBCursor cursor = collection.find(document);
        //System.out.println(cursor.one());

    }
    public static DBObject convert(MongoObject mongoObject){
        //DBObject object = new BasicDBObject("employee", "bob").append("items",new int[]).append("table","table5");
        //^^^^^^^^^^ Template how to create an object using Java     vvvvvvvvv example what I use
        return new BasicDBObject("XP", mongoObject.getXp()).append("Timer",mongoObject.getTimer()).append("memberId",mongoObject.getMemmberId());
    }

}
