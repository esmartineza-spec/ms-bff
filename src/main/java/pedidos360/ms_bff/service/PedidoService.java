package pedidos360.ms_bff.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;
import pedidos360.ms_bff.model.Pedido;

import java.util.List;

@Service
public class PedidoService {

    private final RestClient restClient;

    public PedidoService(
            RestClient.Builder restClientBuilder,
            @Value("${orders.service.url}") String ordersUrl) {

        this.restClient = restClientBuilder
                .baseUrl(ordersUrl)
                .build();
    }

    public List<Pedido> listarPedidos() {

        return restClient.get()
                .uri("/api/pedidos")
                .retrieve()
                .body(List.class);
    }
}
