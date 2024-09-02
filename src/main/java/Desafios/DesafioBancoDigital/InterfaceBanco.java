package Desafios.DesafioBancoDigital;

public interface InterfaceBanco {

    void sacar (double valor);

    void depositar (double valor);

    String tipoConta();

    /*
    boolean existeProduto(Produto produto);

	Produto pesquisaProduto(String codigoProduto);

	boolean cadastraProduto(Produto produto);

	boolean cadastraPedido(Pedido pedido);

	boolean existePedido(Pedido pedido);

	boolean cadastraCliente(Cliente cliente);

	boolean existeCliente(Cliente cliente);

	Cliente pesquisaCliente(String id) throws ClienteNaoExisteException;

	Cliente pesquisaClientePeloNome(String nome) throws ClienteNaoExisteException;

	List<Cliente> pesquisaClientesComNomeComecandoCom(String prefixo);

	List<Pedido> pesquisaPedidosIncluindoProduto(String codigoProduto);

	void setClientes(List<Cliente> clientes);

	List<Cliente> getClientes();

	void setProdutos(List<Produto> produtos);

	List<Produto> getProdutos();

	List<Pedido> getPedido();

	void setPedidos(List<Pedido> pedidos);

	List<Cliente> retornaTodosClientes();

	boolean alterarPreçoDoProduto(String codigo, double novoPreco);

	boolean alterarQuantEstoque(String codigo, int novaQuant);
     */
}
