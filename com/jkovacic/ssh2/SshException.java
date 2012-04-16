/*
Copyright 2012, Jernej Kovacic

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

   http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/ 

package com.jkovacic.ssh2;

/**
 * An exception, thrown at unexpected events during a SSH session
 * 
 * @author Jernej Kovacic
 *
 */
public class SshException extends Exception 
{
	static final long serialVersionUID = 18L;
	
	/**
	 * Constructor with a description
	 * 
	 * @param desc - description of the exception, later may be retrieved by getMessage 
	 */
    SshException(String s)
    {
        super(s);
    }
}
