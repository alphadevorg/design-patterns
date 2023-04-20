package com.alphadev.bridge;

public class Main {

    public static void main(String[] args) {
        VideoProcessor hdProcessor = new HDProcessor();
        Video netflixVideo = new NetflixVideo(hdProcessor);
        netflixVideo.play("abc.mp4");

        VideoProcessor uhd4kprocessor = new UHD4KProcessor();
        Video youtubeVideo = new YoutubeVideo(uhd4kprocessor);
        youtubeVideo.play("abc.mp4");
    }

}
