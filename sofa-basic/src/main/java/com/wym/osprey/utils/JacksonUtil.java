package com.wym.osprey.utils;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.JsonParser;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.MappingJsonFactory;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class JacksonUtil {
	/**
	 * 将json字符串转换为实体类对象
	 * 
	 * @param json
	 * @return
	 */
	public static Object json2Obj(String json) {
		try {
			ObjectMapper mapper = new ObjectMapper();
			Object entiy = mapper.readValue(json, Object.class);
			return entiy;
		} catch (JsonParseException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}

	/**
	 * 将对象object转换为json字符串.
	 * 
	 * @param object
	 * @return
	 */
	public static String obj2Json(Object object) {
		try {
			ObjectMapper mapper = new ObjectMapper();
			String json = mapper.writeValueAsString(object);
			return json;
		} catch (JsonGenerationException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}

	/**
	 * JSON转换为Object对象
	 * 
	 * @param jsonString
	 *            JSON字符串
	 * @param c
	 *            要转换成的类的类型
	 * @return Object对象
	 */
	public static <T> T jsonToObject(String jsonString, Class<T> c) {
		if (jsonString == null || "".equals(jsonString)) {
			return null;
		} else {
			// Jackson方式将Json转换为对象
			MappingJsonFactory f = new MappingJsonFactory();
			try {
				JsonParser parser = f.createJsonParser(jsonString);
				return parser.readValueAs(c);
			} catch (Exception e) {
				e.printStackTrace();
				return null;
			}
		}
	}

	/**
	 * 数组格式JSON串转换为ObjectList对象
	 * 
	 * @param <T>
	 * @param jsonString
	 *            JSON字符串
	 * @param tr
	 *            TypeReference,例如: new TypeReference< List<Album> >(){}
	 * @return ObjectList对象
	 */
	public static <T> T jsonToGenericObject(String jsonString,
			TypeReference<T> tr) {
		if (jsonString == null || "".equals(jsonString)) {
			return null;
		} else {
			// Jackson方式将Json转换为对象
			MappingJsonFactory f = new MappingJsonFactory();
			try {
				JsonParser parser = f.createJsonParser(jsonString);
				return parser.readValueAs(tr);
			} catch (Exception e) {
				return null;
			}
		}
	}

	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws Exception {
		Map<String, String> map = new HashMap<String, String>();
		map.put("username", "张三");
		map.put("idcard", "360427199011172018");
		// 转换成json
		String jsonStr = JacksonUtil.obj2Json(map);
		Map<String, String> map2 = (Map<String, String>) JacksonUtil
				.json2Obj(jsonStr);
		System.err.println(jsonStr);
		System.err.println(map2.toString());
	}
}