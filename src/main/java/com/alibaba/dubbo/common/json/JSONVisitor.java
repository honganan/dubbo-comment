/*
 * Copyright 1999-2011 Alibaba Group.
 *  
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *  
 *      http://www.apache.org/licenses/LICENSE-2.0
 *  
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.alibaba.dubbo.common.json;

/**
 * JSONVisitor.
 * 
 * @author qian.lei
 */

public interface JSONVisitor
{
	public static final String CLASS_PROPERTY = "class";

	/**
	 * parse begin .
	 */
	void begin();

	/**
	 * parse end.
	 * 
	 * @param obj root obj.
	 * @param isValue is json value.
	 * @return parse result.
	 * @throws com.alibaba.dubbo.common.json.ParseException
	 */
	Object end(Object obj, boolean isValue) throws ParseException;

	/**
	 * object begin.
	 * 
	 * @throws com.alibaba.dubbo.common.json.ParseException
	 */
	void objectBegin() throws ParseException;

	/**
	 * object end, return object value.
	 * 
	 * @param count property count.
	 * @return object value.
	 * @throws com.alibaba.dubbo.common.json.ParseException
	 */
	Object objectEnd(int count) throws ParseException;

	/**
	 * object property name.
	 * 
	 * @param name name.
	 * @throws com.alibaba.dubbo.common.json.ParseException
	 */
	void objectItem(String name) throws ParseException;

	/**
	 * object property value.
	 * 
	 * @param obj obj.
	 * @param isValue is json value.
	 * @throws com.alibaba.dubbo.common.json.ParseException
	 */
	void objectItemValue(Object obj, boolean isValue) throws ParseException;

	/**
	 * array begin.
	 * 
	 * @throws com.alibaba.dubbo.common.json.ParseException
	 */
	void arrayBegin() throws ParseException;

	/**
	 * array end, return array value.
	 * 
	 * @param count count.
	 * @return array value.
	 * @throws com.alibaba.dubbo.common.json.ParseException
	 */
	Object arrayEnd(int count) throws ParseException;

	/**
	 * array item.
	 * 
	 * @param index index.
	 * @throws com.alibaba.dubbo.common.json.ParseException
	 */
	void arrayItem(int index) throws ParseException;

	/**
	 * array item.
	 * 
	 * @param index index.
	 * @param obj item.
	 * @param isValue is json value.
	 * @throws com.alibaba.dubbo.common.json.ParseException
	 */
	void arrayItemValue(int index, Object obj, boolean isValue) throws ParseException;
}