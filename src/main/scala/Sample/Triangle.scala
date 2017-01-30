package Sample

/**
  * Created by s.kato on 2017/01/30.
  */
class Triangle {
  def sample: Unit = {
    //1から1000までの3つの整数a, b, cについて、三辺からなる三角形が直角三角形になるような a, b, cの組み合わせを全て出力してください。直角三角形の条件にはピタゴラスの定理を利用してください。 ピタゴラスの定理とは三平方の定理とも呼ばれ、a ^ 2 == b ^ 2 + c ^ 2を満たす、a, b, c の長さの三辺を持つ三角形は、直角三角形になるというものです。
    for (a <- 1 to 1000; b <- 1 to 1000; c <- 1 to 1000 if a * a == b * b + c * c) {
      println((a, b, c))
    }
  }
}
