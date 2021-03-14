import org.junit.Assert;
import org.junit.Test;

public class CuboidTest {
    private static final Cuboid cuboid = new Cuboid(1,2,3);

    @Test
    public void getLength() {
        Assert.assertEquals(cuboid.getLength(), 1.0, 1e-8);
    }

    @Test
    public void getWidth() {
        Assert.assertEquals(cuboid.getWidth(), 2.0, 1e-8);
    }

    @Test
    public void getHeight() {
        Assert.assertEquals(cuboid.getHeight(), 3.0, 1e-8);
    }

    @Test
    public void getVolume() {
        Assert.assertEquals(cuboid.getVolume(), 6.0, 1e-8);
    }
}