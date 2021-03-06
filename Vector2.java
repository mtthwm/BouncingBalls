public class Vector2
{
  public double x;
  public double y;

  public Vector2 (double x, double y)
  {
    this.x = x;
    this.y = y;
  }
  
  public Vector2 (Vector2 other)
  {
      this.x = other.x;
      this.y = other.y;
  }

  public Vector2 subtract (Vector2 other)
  {
    return new Vector2(this.x-other.x, this.y-other.y);
  }
  
  public Vector2 subtract (double scalar)
  {
    return new Vector2(this.x-scalar, this.y-scalar);
  }

  public Vector2 add (Vector2 other)
  {
    return new Vector2(this.x+other.x, this.y+other.y);
  }

  public Vector2 multiply (double other)
  {
    return new Vector2(this.x * other, this.y * other);
  }
  
  public double dot (Vector2 other)
  {
      return this.x * other.x + this.y * other.y;
  }
  
  @Override
  public String toString() {
    return "(" + x + ", " + y + ')';
  }

  public Vector2 divide (double other)
  {
    return new Vector2(this.x/other, this.y/other);
  }

  public static double distance (Vector2 v1, Vector2 v2)
  {
    return Math.sqrt(Math.pow(v2.x - v1.x, 2) + Math.pow(v2.y - v2.y, 2));
  }

  public double magnitude ()
  {
    return Math.sqrt(this.x*this.x + this.y*this.y);
  }

  public Vector2 normalized ()
  {
    return this.divide(this.magnitude());
  }
}