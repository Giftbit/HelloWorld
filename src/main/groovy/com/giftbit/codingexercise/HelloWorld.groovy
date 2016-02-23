package com.giftbit.codingexercise

import groovyx.net.http.HTTPBuilder
import static groovyx.net.http.Method.GET
import static groovyx.net.http.ContentType.JSON

class HelloWorld {

  def http = new HTTPBuilder( 'http://ajax.googleapis.com' )

  public String whatShouldISay() {
     "Hello World"
  }

  def search(String query) {
    http.request( GET, JSON ) {
      uri.path = '/ajax/services/search/web'
      uri.query = [ v:'1.0', q: query ]

      response.success = { resp, json ->
        assert json.size() == 3
        println "Query response: "
        json.responseData.results.each {
          println "  ${it.titleNoFormatting} : ${it.visibleUrl}"
        }
      }

      response.'404' = { resp ->
        println 'Not found'
      }
    }
  }
}
