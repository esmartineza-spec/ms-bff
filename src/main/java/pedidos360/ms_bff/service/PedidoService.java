package pedidos360.ms_bff.service;

import org.springframework.stereotype.Service;
import pedidos360.ms_bff.model.Pedido;

import java.util.List;

@Service
public class PedidoService {

    public List<Pedido> listarPedidos() {

        return List.of(
                new Pedido(1L, "Juan Pérez", "Notebook", 1),
                new Pedido(2L, "María González", "Mouse", 2),
                new Pedido(3L, "Pedro Soto", "Teclado", 1)
        );
    }
}
