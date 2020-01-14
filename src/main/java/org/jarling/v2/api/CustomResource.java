package org.jarling.v2.api;

import org.jarling.exceptions.StarlingBankRequestException;

import java.util.List;
import java.util.Map;

public interface CustomResource {

    /**
     * Retrieves a custom list from JSON response for a specified path under the base path. This is to allow easier
     * reuse when the return types needs to be modified to reflect recent changes.
     *
     * @param clazz Class type of response entities
     * @param urlPath Path under base path to make the HTTP GET request to
     * @param memberName Member to extract from the JSON response
     * @return List of each parsed entity from the response
     */
    public <T> List<T> getCustomList(final Class<T[]> clazz, String urlPath, Map<String, String> parameters, String memberName) throws StarlingBankRequestException;
}
