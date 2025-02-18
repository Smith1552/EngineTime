import java.math.*;
public class Vector3 {
    //holds vector dimensions. Not sure what "real" would be in java, so
    //I've made them floats for now
    public float x;
    public float y;
    public float z;
    private float padding; //uhhh...yeah...4th vector value
    public Vector3(float x, float y, float z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    //invert the vector
    public void invert(){
        x = -x;
        y = -y;
        z = -z;
    }

    //returns magnitude
    float magnitude(){
        return (float)Math.sqrt(x*x + y*y + z*z);
    }
    //slightly faster as it avoids square root
    float squaredMagnitude(){
        return x*x + y*y + z*z;
    }

    void normalize(){
        float mag = magnitude();
        if(mag > 0){
            //I can't quite parse this part
        }
    }

    Vector3 scaleBy(float value){
        x *= value;
        y *= value;
        z *= value;
        return this;//no idea what this returns tbh
    }

    Vector3 addThis(float value){
        x += value;
        y += value;
        z += value;
        return this;
    }

    Vector3 subtractThis(float value){
        x -= value;
        y -= value;
        z -= value;
        return this;
    }

    void addScaled(Vector3 vector, float scale){
        x += vector.x * scale;
        y += vector.y * scale;
        z += vector.z * scale;
    }

    //generate component products
    Vector3 componentProduct(Vector3 vector){
        return new Vector3(x*vector.x, y*vector.y, z*vector.z);
    }

    //update the vector
    void componentProductUpdate(Vector3 vector){
        x *= vector.x;
        y *= vector.y;
        z *= vector.z;
    }

    float scalarProduct(Vector3 vector){
        return x * vector.x + y * vector.y + z * vector.z;
    }

    Vector3 vectorProduct(Vector3 vector){
        return new Vector3(y*vector.z-z*vector.y,
                           z*vector.x-x*vector.z,
                           x*vector.y-y*vector.x);
    }
    /**
     * Updates this vector to be the vector product of its current
     * value and the given vector.
     */
    void updateVectorWithProduct(Vector3 vector){
         //again I have no idea what's going on here (pg 32)
    }





}
