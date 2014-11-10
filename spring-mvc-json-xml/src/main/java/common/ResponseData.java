package common;

import java.io.Serializable;
import java.util.Collections;
import java.util.List;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

import com.sun.xml.txw2.annotation.XmlElement;

/**
 * @author Manh Vu
 */
@XmlRootElement
public class ResponseData implements Serializable {
	/** serialVersionUID */
	private static final long serialVersionUID = -746611034363691461L;
	private int code;
	private String message;
	private List<?> data;

	public ResponseData() {
		super();
	}

	public ResponseData(int code, String message, List<?> data) {
		super();
		this.code = code;
		this.message = message;
		this.data = data;
	}

	@XmlAttribute
	public int getCode() {
		return code;
	}

	@XmlAttribute
	public String getMessage() {
		return message;
	}

	@XmlElement
	public List<?> getData() {
		if (data == null) {
			data = Collections.emptyList();
		}

		return data;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public void setData(List<?> data) {
		this.data = data;
	}
}
