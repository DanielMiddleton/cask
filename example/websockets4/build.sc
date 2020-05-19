import mill._, scalalib._


trait AppModule extends ScalaModule{
  def scalaVersion = "2.13.1"
  def ivyDeps = Agg[Dep](
  )
  object test extends Tests{
    def testFrameworks = Seq("utest.runner.Framework")

    def ivyDeps = Agg(
      ivy"com.lihaoyi::utest::0.7.4",
      ivy"com.lihaoyi::requests::0.6.2",
      ivy"org.asynchttpclient:async-http-client:2.5.2"
    )
  }
}