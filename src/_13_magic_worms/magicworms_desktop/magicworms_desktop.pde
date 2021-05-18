float x = 0;
  float y = 0;
void draw() {
  makeMagical();
  for(int circle = 0; circle < 300; circle++) {
    noStroke();
    fill(frameCount, circle, 2);
    x = getWormX(circle);
    y = getWormY(circle);
    ellipse(x, y, 15, 15);
  }
}
void setup() {
  size(400, 400);
  background(0, 0, 0);
}
float frequency = .001;
    float noiseInterval = PI;

    void makeMagical() {
        fill( 0, 0, 0, 10 );
        rect(0, 0, width, height);
        noStroke();
    }

    float getWormX(int i) {
        return map(noise(i*noiseInterval + frameCount * frequency), 0, 1, 0, width);
    }

    float getWormY(int i) {
        return map(noise(i*noiseInterval+1 + frameCount * frequency), 0, 1, 0, height);
    }
