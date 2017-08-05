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
package com.alibaba.dubbo.common.serialize;

import java.io.IOException;

/**
 * Data input.
 * 
 * @author qian.lei
 */
public interface DataInput {
    
	/**
	 * Read boolean.
	 * 
	 * @return boolean.
	 * @throws java.io.IOException.
	 */
	boolean readBool() throws IOException;

	/**
	 * Read byte.
	 * 
	 * @return byte value.
	 * @throws java.io.IOException.
	 */
	byte readByte() throws IOException;

	/**
	 * Read short integer.
	 * 
	 * @return short.
	 * @throws java.io.IOException.
	 */
	short readShort() throws IOException;

	/**
	 * Read integer.
	 * 
	 * @return integer.
	 * @throws java.io.IOException.
	 */
	int readInt() throws IOException;

	/**
	 * Read long.
	 * 
	 * @return long.
	 * @throws java.io.IOException.
	 */
	long readLong() throws IOException;

	/**
	 * Read float.
	 * 
	 * @return float.
	 * @throws java.io.IOException.
	 */
	float readFloat() throws IOException;

	/**
	 * Read double.
	 * 
	 * @return double.
	 * @throws java.io.IOException.
	 */
	double readDouble() throws IOException;

	/**
	 * Read UTF-8 string.
	 * 
	 * @return string.
	 * @throws java.io.IOException.
	 */
	String readUTF() throws IOException;

	/**
	 * Read byte array.
	 * 
	 * @return byte array.
	 * @throws java.io.IOException.
	 */
	byte[] readBytes() throws IOException;
}