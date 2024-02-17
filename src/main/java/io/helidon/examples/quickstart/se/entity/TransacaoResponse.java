package io.helidon.examples.quickstart.se.entity;

import java.io.Serializable;

public class TransacaoResponse implements Serializable
{
   private static final long serialVersionUID = -7295697100860976047L;

   private long limite;

   private long saldo;

   public long getLimite()
   {
      return limite;
   }

   public void setLimite(long limite)
   {
      this.limite = limite;
   }

   public long getSaldo()
   {
      return saldo;
   }

   public void setSaldo(long saldo)
   {
      this.saldo = saldo;
   }
}