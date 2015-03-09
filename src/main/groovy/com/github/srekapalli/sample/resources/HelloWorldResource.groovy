package com.github.srekapalli.sample.resources

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import com.wordnik.swagger.annotations.ApiOperation
import static org.springframework.web.bind.annotation.RequestMethod.GET
import org.springframework.http.ResponseEntity
import org.springframework.http.HttpStatus
import org.springframework.http.HttpHeaders


@RestController
class HelloWorldResource {

    @RequestMapping(value = "/api", method = GET)
    @ApiOperation("hello world")
    ResponseEntity<String> hello() {
      HttpHeaders headers = new HttpHeaders()
      headers.add("Content-Type", "application/json")
      headers.add("Access-Control-Allow-Origin", "*")
      headers.add("Access-Control-Allow-Methods", "POST, GET, OPTIONS, DELETE")
      headers.add("Access-Control-Max-Age", "3600")
      headers.add("Access-Control-Allow-Headers", "x-requested-with")
      new ResponseEntity<String>("{ \"name\":\"gradle Java webserice\"}", headers, HttpStatus.OK)
    }
}

class Message {

   String name

}
