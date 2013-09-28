// Copyright 2013 Michel Kraemer
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package de.undercouch.citeproc.mendeley;

/**
 * This exception is thrown when a user is not authenticated
 * @author Michel Kraemer
 */
public class UnauthorizedException extends MendeleyRequestException {
	private static final long serialVersionUID = -4587555569639659798L;
	
	/**
	 * @see Exception#Exception()
	 */
	public UnauthorizedException() {
		//nothing to do here
	}

	/**
	 * @see Exception#Exception(String)
	 */
	public UnauthorizedException(String message) {
		super(message);
	}

	/**
	 * @see Exception#Exception(Throwable)
	 */
	public UnauthorizedException(Throwable cause) {
		super(cause);
	}

	/**
	 * @see Exception#Exception(String, Throwable)
	 */
	public UnauthorizedException(String message, Throwable cause) {
		super(message, cause);
	}
}
