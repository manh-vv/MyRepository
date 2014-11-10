package controller;

import java.util.Arrays;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import service.HelloIfc;

import common.ResponseData;
import common.ReturnCode;

/**
 * @author Manh Vu
 */
@Controller
public class HelloController {
	private static final Logger log = LoggerFactory
			.getLogger(HelloController.class);

	@Autowired
	private HelloIfc hello;

	@RequestMapping(value = "/hello", params = "returnType", method = RequestMethod.GET, produces = {
			MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
	@ResponseBody
	public ResponseData hello(String returnType) {
		ResponseData res = null;
		try {
			res = hello.hello();
		} catch (Exception e) {
			log.error(e.getMessage(), e);
			res = new ResponseData(ReturnCode.EXCEPTION, e.getMessage(),
					Arrays.asList(e.getStackTrace()));
		}

		return res;
	}
}
