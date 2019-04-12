package pvt.Task23;

import java.io.IOException;
import java.net.URISyntaxException;

import org.apache.http.client.ClientProtocolException;
import org.junit.Assert;
import org.junit.Test;

public class AppTest {
	private App app = new App();

	@Test
	public void testGetPostOnWall() throws ClientProtocolException, IOException, URISyntaxException {
		Assert.assertEquals(200, app.getWallPosts().getStatusLine().getStatusCode());
	}

	@Test
	public void testAddPostOnWall() throws ClientProtocolException, IOException, URISyntaxException {
		Assert.assertEquals(200, app.addPostOnWall().getStatusLine().getStatusCode());
	}

	@Test
	public void testDeletePostOnWall() throws ClientProtocolException, IOException, URISyntaxException {
		app.addPostOnWall();
		Assert.assertEquals(Integer.parseInt(app.deletePostOnWall()), 1);
	}

	@Test
	public void testEditPostOnWall() throws ClientProtocolException, IOException, URISyntaxException {
		app.addPostOnWall();
		Assert.assertEquals(200, app.editPostOnWall().getStatusLine().getStatusCode());
	}
}
