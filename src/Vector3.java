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
    public float magnitude(){
        return (float)Math.sqrt(x*x + y*y + z*z);
    }
    //slightly faster as it avoids square root
    float squaredMagnitude(){
        return x*x + y*y + z*z;
    }

    public void normalize(){
        float mag = magnitude();
        if(mag > 0){
            //this *= ((float) 1)/mag;
            //see page 23
        }
    }

    public Vector3 scaleBy(float value){
        x *= value;
        y *= value;
        z *= value;
        return this;//no idea what this returns tbh
                    //nvm figured it out it's the main vector
    }

    public Vector3 addThis(float value){
        x += value;
        y += value;
        z += value;
        return this;
    }

    public Vector3 subtractThis(float value){
        x -= value;
        y -= value;
        z -= value;
        return this;
    }

    public void addScaled(Vector3 vector, float scale){
        x += vector.x * scale;
        y += vector.y * scale;
        z += vector.z * scale;
    }

    //generate component product
    public Vector3 componentProduct(Vector3 vector){
        return new Vector3(x*vector.x,
                           y*vector.y,
                           z*vector.z);
    }

    //generate component product and replace current vector w/ this one
    public void componentProductUpdate(Vector3 vector){
        x *= vector.x;
        y *= vector.y;
        z *= vector.z;
    }

    public float scalarProduct(Vector3 vector){
        return x * vector.x + y * vector.y + z * vector.z;
    }
    //calculates the vector product of the current vector and the given vector
    Vector3 vectorProduct(Vector3 vector){
        return new Vector3(y*vector.z-z*vector.y,
                           z*vector.x-x*vector.z,
                           x*vector.y-y*vector.x);
    }

    //updates the current vector with its vector product
    void vectorProductUpdate(Vector3 vector){
        //pointers would be pretty cool right about now
        Vector3 update = this.vectorProduct(vector);
        this.x = update.x;
        this.y = update.y;
        this.z = update.z;
    }
    //see page 32

}//end Vector3
