package pedidos360.ms_bff.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pedidos360.ms_bff.model.Pedido;
import pedidos360.ms_bff.service.PedidoService;

import java.util.List;

@RestController
public class PedidoController {

    private final PedidoService pedidoService;

    public PedidoController(PedidoService pedidoService) {
        this.pedidoService = pedidoService;
    }

    @GetMapping("/api/pedidos")
    public List<Pedido> listarPedidos() {
        return pedidoService.listarPedidos();
    }
}
