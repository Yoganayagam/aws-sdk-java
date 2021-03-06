/*
 * Copyright 2013-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.elasticbeanstalk.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.elasticbeanstalk.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * DescribeApplicationsRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeApplicationsRequestMarshaller implements Marshaller<Request<DescribeApplicationsRequest>, DescribeApplicationsRequest> {

    public Request<DescribeApplicationsRequest> marshall(DescribeApplicationsRequest describeApplicationsRequest) {

        if (describeApplicationsRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<DescribeApplicationsRequest> request = new DefaultRequest<DescribeApplicationsRequest>(describeApplicationsRequest, "AWSElasticBeanstalk");
        request.addParameter("Action", "DescribeApplications");
        request.addParameter("Version", "2010-12-01");
        request.setHttpMethod(HttpMethodName.POST);

        com.amazonaws.internal.SdkInternalList<String> applicationNamesList = (com.amazonaws.internal.SdkInternalList<String>) describeApplicationsRequest
                .getApplicationNames();
        if (!applicationNamesList.isEmpty() || !applicationNamesList.isAutoConstruct()) {
            int applicationNamesListIndex = 1;

            for (String applicationNamesListValue : applicationNamesList) {
                if (applicationNamesListValue != null) {
                    request.addParameter("ApplicationNames.member." + applicationNamesListIndex, StringUtils.fromString(applicationNamesListValue));
                }
                applicationNamesListIndex++;
            }
        }

        return request;
    }

}
