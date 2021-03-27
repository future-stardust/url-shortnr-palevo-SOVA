package edu.kpi.testcourse.rest.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import edu.kpi.testcourse.entities.UrlAlias;
import java.util.List;

/**
 * Successful response on get user shortened links request.
 */
public record UrlsAliasesResponse(@JsonProperty("urls_aliases") List<UrlAlias> urlsAliases) {

}
