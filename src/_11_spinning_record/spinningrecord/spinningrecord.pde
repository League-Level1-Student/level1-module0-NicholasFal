  PImage pictureOfRecord;   
  int angle = 0;
void setup() {
          size(600,600);      
            pictureOfRecord= loadImage("record.png"); 
                    pictureOfRecord.resize(width,height);
}
void rotateImage(PImage image, int amountToRotate) {
        translate(width/2, height/2);
        rotate(amountToRotate*TWO_PI/360);
        translate(-image.width/2, -image.height/2);
    }
void draw() { 
  rotateImage(pictureOfRecord, angle);   
   image(pictureOfRecord, 0, 0); 
   angle++;
}
     
