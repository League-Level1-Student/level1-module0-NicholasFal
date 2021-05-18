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
    y = 10;  
}
  ellipse(randomNumber, y, 20, 30);
  fill(169, 169, 169);
  stroke(0, 0, 0);
  rect(mouseX, 385, 100, 120);
  if(y > height - 120 && checked == false) {
    checkCatch(randomNumber); 
    checked = true;
  }
    y+=10;
    fill(0,0,0);
    textSize(16);
    text("Score: " + score, 20, 20);
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
