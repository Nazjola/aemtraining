package com.moveo.aem.training.core.servlets;

import com.day.cq.commons.jcr.JcrConstants;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.moveo.aem.training.core.models.WeatherModel;
import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.SlingHttpServletResponse;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.api.servlets.HttpConstants;
import org.apache.sling.api.servlets.SlingSafeMethodsServlet;
import org.apache.sling.servlets.annotations.SlingServletResourceTypes;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.propertytypes.ServiceDescription;

import javax.servlet.Servlet;
import javax.servlet.ServletException;
import java.io.IOException;

@Component(service = { Servlet.class })
@SlingServletResourceTypes(
        resourceTypes="aemtraining/components/weather",
        methods= HttpConstants.METHOD_GET,
        extensions="json")
@ServiceDescription("Weather Servlet")
public class WeatherServlet extends SlingSafeMethodsServlet {


    private static final long serialVersionUID = 1L;

    @Override
    protected void doGet(final SlingHttpServletRequest req,
                         final SlingHttpServletResponse resp) throws ServletException, IOException {
        final Resource resource = req.getResource();
        WeatherModel weathermodel =resource.adaptTo(WeatherModel.class);

        ObjectMapper objectMapper = new ObjectMapper();
        String jsonInString = objectMapper.writeValueAsString(weathermodel);
        resp.setContentType("application/json");
        resp.getWriter().write(jsonInString);

    }
}
