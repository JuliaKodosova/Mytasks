package pvt.Task23;

import java.io.IOException;
import java.net.URISyntaxException;

import org.apache.http.ParseException;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;
import org.openqa.selenium.remote.http.HttpClient;
import org.openqa.selenium.remote.http.HttpResponse;

public class App {
	private static String post_id = null;
	private static String responseCode=null;
	public CloseableHttpResponse getWallPosts() throws ClientProtocolException, IOException, URISyntaxException {
		CloseableHttpClient client = HttpClientBuilder.create().build();
		URIBuilder builder = new URIBuilder("https://api.vk.com/method/wall.get?");
		builder.setParameter("access_token",
				"" + "7b8fd189fea9b826ab6bfafe9bafd45a62802c168d816cfdca1900d50d93fa83af372dae5f004e539f1b4")
				.setParameter("owner_id", "165294413").setParameter("v", "5.92");
		HttpGet request = new HttpGet(builder.build());
		CloseableHttpResponse response = client.execute(request);
		return response;
	}

	public CloseableHttpResponse addPostOnWall() throws ClientProtocolException, IOException, URISyntaxException {
		CloseableHttpClient client = HttpClientBuilder.create().build();
		URIBuilder builder2 = new URIBuilder("https://api.vk.com/method/wall.post?");
		builder2.setParameter("access_token",
				"" + "7b8fd189fea9b826ab6bfafe9bafd45a62802c168d816cfdca1900d50d93fa83af372dae5f004e539f1b4")
				.setParameter("owner_id", "165294413").setParameter("message", "test message111")
				.setParameter("v", "5.92");
		HttpGet request2 = new HttpGet(builder2.build());
		CloseableHttpResponse response2 = client.execute(request2);
		post_id = EntityUtils.toString(response2.getEntity()).replaceAll("[^0-9]", "");
		return response2;
	}
	public String deletePostOnWall() throws ClientProtocolException, IOException, URISyntaxException {
		CloseableHttpClient client = HttpClientBuilder.create().build();
		URIBuilder builder3 = new URIBuilder("https://api.vk.com/method/wall.delete?");
		builder3.setParameter("access_token",
				"" + "7b8fd189fea9b826ab6bfafe9bafd45a62802c168d816cfdca1900d50d93fa83af372dae5f004e539f1b4")
				.setParameter("owner_id", "165294413").setParameter("post_id", post_id).setParameter("v", "5.92");
		HttpGet request3 = new HttpGet(builder3.build());
		CloseableHttpResponse response3 = client.execute(request3);
		//System.out.println(EntityUtils.toString(response3.getEntity()));
		responseCode = (EntityUtils.toString(response3.getEntity())).replaceAll("[^0-9]", "");
		return responseCode;
	}
	public CloseableHttpResponse editPostOnWall() throws ClientProtocolException, IOException, URISyntaxException {
		CloseableHttpClient client = HttpClientBuilder.create().build();
		URIBuilder builder4 = new URIBuilder("https://api.vk.com/method/wall.edit?");
		builder4.setParameter("access_token",
				"" + "7b8fd189fea9b826ab6bfafe9bafd45a62802c168d816cfdca1900d50d93fa83af372dae5f004e539f1b4")
				.setParameter("owner_id", "165294413")
				.setParameter("post_id", post_id)
				.setParameter("message", "test message111-edit")
				.setParameter("v", "5.92");
		HttpGet request4 = new HttpGet(builder4.build());
		CloseableHttpResponse response4 = client.execute(request4);
		return response4;
	}

}
