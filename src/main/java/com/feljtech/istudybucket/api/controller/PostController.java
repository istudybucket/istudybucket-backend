package com.feljtech.istudybucket.api.controller;

import com.feljtech.istudybucket.api.dto.PostDto;
import com.feljtech.istudybucket.business.service.PostService;
import lombok.AllArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/post")
@AllArgsConstructor
public class PostController {
   private final PostService postService;

   @PostMapping(value = "", consumes = MediaType.APPLICATION_JSON_VALUE)
   public ResponseEntity<String> addPost(@RequestBody PostDto postDto) {
       return postService.addPost(postDto);
   }

   @GetMapping(value = "/all")
   public List<PostDto> getAllPosts() {
       return postService.getAllPosts();
   }

   @GetMapping(value = "/{authorId}")
   public List<PostDto> getAllPostsByAuthorId(@PathVariable Long authorId){
       return postService.getAllPostsByAuthorId(authorId);
   }

   @GetMapping(value = "/{postId}")
   public ResponseEntity<?> getPostById(@PathVariable Long postId){
       return postService.getPostById(postId);
   }
}
