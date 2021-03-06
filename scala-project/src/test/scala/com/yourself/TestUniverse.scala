package com.yourself

import org.scalatest._

class TestUniverse extends FlatSpec with Matchers {

  "countAllStars" should "sum stars" in {
    assert(Universe.countAllStars(List(2, 3)) == 5)
    assert(Universe.countAllStars(List(9, -3)) == 6)
    if (io.Source.fromFile("./src/main/scala/com/yourself/Universe.scala").getLines.exists(_.contains("galaxies.sum"))) {
      msg("My personal Yoda, you are. π", "* β ΒΈ .γΒΈ. :Β° βΎ Β° γΒΈ. β ΒΈ .γγΒΈ.γ:. β’ ");
      msg("My personal Yoda, you are. π", "           γβ Β°  β ΒΈ. ΒΈ γβγ :.γ .   ");
      msg("My personal Yoda, you are. π", "__.-._     Β° . .γγγγ.γβΎ Β° γ. *   ΒΈ .");
      msg("My personal Yoda, you are. π", "'-._ 7'      .γγΒ° βΎ  Β° γΒΈ.β  β .γγγ");
      msg("My personal Yoda, you are. π", " /'.-c    γ   * β  ΒΈ.γγΒ°     Β° γΒΈ.    ");
      msg("My personal Yoda, you are. π", " |  /T      γγΒ°     Β° γΒΈ.     ΒΈ .γγ  ");
      msg("My personal Yoda, you are. π", "_)_/LI");
    } else {
      msg("Kudos π", "Did you know all the feature of the collection API? Try it!");
      msg("Kudos π", "");
      msg("Kudos π", "val galaxies = List(37, 3, 2);");
      msg("Kudos π", "val totalStars = galaxies.sum // 42");
    }

  }

  def success(success: Boolean) = println(s"TECHIO> success $success")
  def msg(channel: String, msg: String) = println(s"""TECHIO> message --channel "$channel" "$msg" """)
}
