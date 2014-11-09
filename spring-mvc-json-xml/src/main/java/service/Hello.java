package service;

import org.springframework.stereotype.Service;

import common.AbsMyService;
import common.ResponseData;
import common.ReturnCode;

/**
 * @author Manh Vu
 */
@Service
public class Hello extends AbsMyService implements HelloIfc {

	@Override
	public ResponseData hello() {
		return (new ResponseData(ReturnCode.SUCCESS, "Hello", null));
	}

}
