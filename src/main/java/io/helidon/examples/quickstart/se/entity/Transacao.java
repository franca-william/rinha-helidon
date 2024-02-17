package io.helidon.examples.quickstart.se.entity;

import java.io.Serializable;

public class Transacao implements Serializable
{
   private static final long serialVersionUID = -3421607391369203457L;

   private long valor;

   private char tipo;

   private String descricao;

   public long getValor()
   {
      return valor;
   }

   public void setValor(long valor)
   {
      this.valor = valor;
   }

   public char getTipo()
   {
      return tipo;
   }

   public void setTipo(char tipo)
   {
      this.tipo = tipo;
   }

   public String getDescricao()
   {
      return descricao;
   }

   public void setDescricao(String descricao)
   {
      this.descricao = descricao;
   }

}
