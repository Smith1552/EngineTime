import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Vector3Test {
    @Test
    public void invert(){
        Vector3 vector = new Vector3(1,1,1);
        vector.invert();
        float a = vector.x + vector.y + vector.z;
        assertEquals(-3,a);
    }

    @Test
    public void scaleBy(){
        Vector3 vector = new Vector3(2,3,2);
        vector.scaleBy(2);
        float a = vector.x + vector.y + vector.z;
        assertEquals(14,a);
    }

    @Test
    public void addThis(){
        Vector3 vector = new Vector3(1,1,1);
        vector.addThis(2);
        float a = vector.x + vector.y + vector.z;
        assertEquals(9,a);
    }

    @Test
    public void subtractThis(){
        Vector3 vector = new Vector3(3,3,3);
        vector.subtractThis(2);
        float a = vector.x + vector.y + vector.z;
        assertEquals(3,a);
    }

    @Test
    public void addScaled(){
        Vector3 vector1 = new Vector3(1,1,1);
        Vector3 vector2 = new Vector3(2,2,2);
        vector1.addScaled(vector2, 5);
        float a = vector1.x + vector1.y + vector1.z;
        assertEquals(33,a);
    }

    @Test
    public void componentProduct(){
        Vector3 vector1 = new Vector3(2,5,10);
        Vector3 v1ComponentVector = vector1.componentProduct(vector1);
        float a = v1ComponentVector.x + v1ComponentVector.y + v1ComponentVector.z;
        assertEquals(129,a);
    }

    @Test
    public void componentProductUpdate(){
        Vector3 vector1 = new Vector3(2,5,10);
        vector1.componentProductUpdate(vector1);
        float a = vector1.x + vector1.y + vector1.z;
        assertEquals(129,a);
    }

    @Test
    public void vectorProduct(){
        Vector3 vector1 = new Vector3(2,5,10);
        Vector3 vector2 = new Vector3(1,2,3);
        Vector3 vector3 = vector1.vectorProduct(vector2);
        float a = vector3.x + vector3.y + vector3.z;
        assertEquals(-2,a);
    }

    @Test
    public void vectorProductUpdate(){
        Vector3 vector1 = new Vector3(2,5,10);
        Vector3 vector2 = new Vector3(1,2,3);
        vector1.vectorProductUpdate(vector2);
        float a = vector1.x + vector1.y + vector1.z;
        assertEquals(-2,a);
    }






}