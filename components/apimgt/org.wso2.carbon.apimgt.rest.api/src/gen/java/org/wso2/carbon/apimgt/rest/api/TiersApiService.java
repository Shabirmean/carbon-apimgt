package org.wso2.carbon.apimgt.rest.api;

import org.wso2.carbon.apimgt.rest.api.*;
import org.wso2.carbon.apimgt.rest.api.model.*;

import org.wso2.carbon.apimgt.rest.api.model.Tier;
import org.wso2.carbon.apimgt.rest.api.model.Error;

import java.util.List;
import org.wso2.carbon.apimgt.rest.api.NotFoundException;

import java.io.InputStream;


import javax.ws.rs.core.Response;

public abstract class TiersApiService {
  
      public abstract Response tiersGet(String accept,String ifNoneMatch)
      throws NotFoundException;
  
}