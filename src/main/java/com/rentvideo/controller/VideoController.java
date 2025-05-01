package com.rentvideo.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/videos")
public class VideoController {

    @GetMapping
    public String getAllVideos() {
        return "List of videos";
    }

    @PostMapping("/{id}/rent")
    public String rentVideo(@PathVariable Long id) {
        return "Rent video with id " + id;
    }

    @PostMapping("/{id}/return")
    public String returnVideo(@PathVariable Long id) {
        return "Return video with id " + id;
    }
}