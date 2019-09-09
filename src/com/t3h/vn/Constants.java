package com.t3h.vn;

public interface Constants
{
    int WIDTH_FRAME = 1200;
    int HEIGHT_FRAME = WIDTH_FRAME*2/3;
    int HEIGHT_HEADER = HEIGHT_FRAME/5;
    int COLUMN = 6;
    int ROW = 6;
    int PADDING_LEFT_PRIVATE = WIDTH_FRAME/12;
    int PADDING_TOP_PRIVATE = WIDTH_FRAME/30;
    int SIZE_PI_1 = (WIDTH_FRAME - 2*PADDING_LEFT_PRIVATE)/COLUMN;
    int SIZE_PI_2 = (HEIGHT_FRAME - HEIGHT_HEADER - 2*PADDING_TOP_PRIVATE)/ROW;

    int SIZE_PI = SIZE_PI_1 > SIZE_PI_2 ? SIZE_PI_2 :SIZE_PI_1;
    int PADDING_LEFT = (WIDTH_FRAME - SIZE_PI*COLUMN)/2;
    int PADDING_TOP = (HEIGHT_FRAME - HEIGHT_HEADER - ROW *SIZE_PI)/3;
}