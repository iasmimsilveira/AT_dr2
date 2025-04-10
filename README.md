# PROJETO AT: Engenharia de Software - Clean Code e Boas Práticas

## 📦 Visão Geral

Este projeto é o resultado da atividade avaliativa DR2 de Engenharia de Software, focada na **refatoração de um sistema legado de pedidos de entrega**, aplicando os princípios de **Clean Code**, **responsabilidade única**, **modularidade**, **injeção de dependência** e **testabilidade**.

O sistema original possuía problemas como ausência de validações, alta complexidade, responsabilidades misturadas, acoplamento excessivo e má nomenclatura. A refatoração propôs uma solução sustentável, clara e extensível.

---

## 🎯 Objetivos Atendidos

- ✔️ Separação em camadas de abstração: `dominio`, `negocio`, `apresentacao`
- ✔️ Classe imutável `Entrega` com validações
- ✔️ Estratégia de frete com interface `CalculadoraDeFrete`
- ✔️ Padrão de projeto **Strategy** aplicado
- ✔️ Injeção de dependência via construtor (`ServicoDeEtiqueta`)
- ✔️ Exceção personalizada para tratamento robusto de erros
- ✔️ Substituição de estruturas rígidas (`if-else`) por polimorfismo
- ✔️ Testes automatizados com JUnit 5


✍️ Desenvolvedora
Iasmim Silveira
