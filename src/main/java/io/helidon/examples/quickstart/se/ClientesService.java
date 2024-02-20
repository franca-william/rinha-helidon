package io.helidon.examples.quickstart.se;

import java.util.Collections;

import io.helidon.webserver.http.HttpRules;
import io.helidon.webserver.http.HttpService;
import io.helidon.webserver.http.ServerRequest;
import io.helidon.webserver.http.ServerResponse;
import jakarta.json.Json;
import jakarta.json.JsonBuilderFactory;
import jakarta.json.JsonObject;

public class ClientesService implements HttpService
{
   private static final JsonBuilderFactory JSON = Json.createBuilderFactory(Collections.emptyMap());

   @Override
   public void routing(HttpRules rules)
   {
      rules
         .post("/{id}/transacoes", this::postTransacaoHandler)
         .get("/{id}/extrato", this::getExtratoHandler)
      ;
   }

   private void postTransacaoHandler(ServerRequest request, ServerResponse response)
   {
      int id = Integer.valueOf(request.path().pathParameters().get("id"));
      if (id > 5)
      {
         sendNotFound(response);
      }
      else
      {
         sendResponse(response);
      }
   }

   private void getExtratoHandler(ServerRequest request, ServerResponse response)
   {
      int id = Integer.valueOf(request.path().pathParameters().get("id"));
      if (id > 5)
      {
         sendNotFound(response);
      }
      else
      {
         sendResponse(response);
      }
   }

   private void sendResponse(ServerResponse response)
   {

      JsonObject returnObject = JSON.createObjectBuilder().add("message", "vazio").build();
      response.send(returnObject);
   }

   private void sendNotFound(ServerResponse response)
   {
      response.status(404).send();
   }

}
