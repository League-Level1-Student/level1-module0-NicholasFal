int y = 10;
int randomNumber = (int) random(500);
boolean checked = false;
void draw(){
  background(1, 175, 222);
  fill(1, 29, 240);
  stroke(100, 100, 100);
  if(y > 515) {
    randomNumber = (int) random(500);
    checked = false;
  }
  ellipse(randomNumber, y, 20, 30);
  if(y < 515) {
  y+=5;
  } else {
    y = 10;
  }
  fill(169, 169, 169);
  stroke(0, 0, 0);
  rect(mouseX, 385, 100, 120);
  if(y > 365 && checked == false) {
    checkCatch(randomNumber); 
    checked = true;
  }
}
void setup(){
  size(500, 500);
}
int score;
void checkCatch(int x){
         if (x > mouseX && x < mouseX+100)
            score++;
         else if (score > 0) 
            score--;
        println("Your score is now: " + score);
    }
