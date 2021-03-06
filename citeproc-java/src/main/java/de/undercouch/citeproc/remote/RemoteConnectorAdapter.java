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

package de.undercouch.citeproc.remote;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import de.undercouch.citeproc.csl.CSLItemData;

/**
 * Can be used by {@link RemoteConnector} implementations to delegate to
 * an underlying connector
 * @author Michel Kraemer
 */
public class RemoteConnectorAdapter implements RemoteConnector {
	/**
	 * The underlying connector
	 */
	private final RemoteConnector delegate;

	/**
	 * Creates a new adapter for the given underlying connector
	 * @param delegate the underlying connector
	 */
	public RemoteConnectorAdapter(RemoteConnector delegate) {
		this.delegate = delegate;
	}

	@Override
	public String getAuthorizationURL() throws IOException {
		return delegate.getAuthorizationURL();
	}

	@Override
	public void authorize(String verificationCode) throws IOException {
		delegate.authorize(verificationCode);
	}

	@Override
	public void setAccessToken(String token, String secret) {
		delegate.setAccessToken(token, secret);
	}

	@Override
	public String getAccessTokenValue() {
		return delegate.getAccessTokenValue();
	}

	@Override
	public String getAccessTokenSecret() {
		return delegate.getAccessTokenSecret();
	}

	@Override
	public List<String> getItemIDs() throws IOException {
		return delegate.getItemIDs();
	}

	@Override
	public CSLItemData getItem(String itemId) throws IOException {
		return delegate.getItem(itemId);
	}
	
	@Override
	public Map<String, CSLItemData> getItems(List<String> itemIds) throws IOException {
		return delegate.getItems(itemIds);
	}
	
	@Override
	public int getMaxBulkItems() {
		return delegate.getMaxBulkItems();
	}
}
