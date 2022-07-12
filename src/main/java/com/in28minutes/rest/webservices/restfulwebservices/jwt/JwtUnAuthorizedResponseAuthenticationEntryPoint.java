package com.in28minutes.rest.webservices.restfulwebservices.jwt;

import java.io.IOException;
import java.io.Serializable;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.web.AuthenticationEntryPoint;
import org.springframework.stereotype.Component;

import com.in28minutes.rest.webservices.restfulwebservices.jwt.resource.AuthenticationException;

@Component
public class JwtUnAuthorizedResponseAuthenticationEntryPoint implements AuthenticationEntryPoint, Serializable {

  private static final long serialVersionUID = -8970718410437077606L;

  @Override
  public void commence(HttpServletRequest request, HttpServletResponse response,
		  org.springframework.security.core.AuthenticationException authException) throws IOException {
    response.sendError(HttpServletResponse.SC_UNAUTHORIZED,
        "You would need to provide the Jwt Token to Access This resource");
  }


}


