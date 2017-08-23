
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import play.data._
import play.core.j.PlayFormsMagicForJava._

object products extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[List[models.Product],play.twirl.api.HtmlFormat.Appendable] {

  /* Parameters */
  def apply/*2.2*/(products: List[models.Product]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.34*/("""

"""),format.raw/*4.1*/("""<!-- Pass page title and content """),format.raw/*4.34*/("""{"""),format.raw/*4.35*/("""html between braces"""),format.raw/*4.54*/("""}"""),format.raw/*4.55*/(""" """),format.raw/*4.56*/("""to the main view -->
"""),_display_(/*5.2*/main("Products")/*5.18*/ {_display_(Seq[Any](format.raw/*5.20*/("""
  """),format.raw/*6.3*/("""<!-- HTML content for the index view -->
  <div class="row">
      <div class="col-sm-2">
        <div class="well">
          <h4>Categories</h4>
        </div>
      </div>
      <div class="col-sm-10">
        <table class="table table-bordered table-hover table-condensed">
          <thead>
          <!-- The header row-->
          <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Description</th>
            <th>Stock</th>
            <th>Price</th>
          </tr>
          </thead>
          <tbody>
            <!-- Product row(s) -->
            """),format.raw/*27.36*/("""
            """),format.raw/*28.77*/("""

            """),_display_(/*30.14*/for(p <- products) yield /*30.32*/ {_display_(Seq[Any](format.raw/*30.34*/("""
            """),format.raw/*31.13*/("""<tr>
              <td>"""),_display_(/*32.20*/p/*32.21*/.getId),format.raw/*32.27*/("""</td>
              <td>"""),_display_(/*33.20*/p/*33.21*/.getName),format.raw/*33.29*/("""</td>
              <td>"""),_display_(/*34.20*/p/*34.21*/.getDescription),format.raw/*34.36*/("""</td>
              <td>"""),_display_(/*35.20*/p/*35.21*/.getStock),format.raw/*35.30*/("""</td>
              <td>&euro; """),_display_(/*36.27*/("%.2f".format(p.getPrice))),format.raw/*36.54*/("""</td>
            </tr>
          """)))}),format.raw/*38.12*/(""" """),format.raw/*38.30*/("""
          """),format.raw/*39.11*/("""</tbody>
        </table>
      </div>
  </div>
  <!-- End of content for main -->
""")))}))
      }
    }
  }

  def render(products:List[models.Product]): play.twirl.api.HtmlFormat.Appendable = apply(products)

  def f:((List[models.Product]) => play.twirl.api.HtmlFormat.Appendable) = (products) => apply(products)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Wed Aug 23 14:11:12 IST 2017
                  SOURCE: /home/wdd/webapps/playapps/playLab_crud-start/app/views/products.scala.html
                  HASH: 61d1ea128b5b59362a6575423bd8b07d947bbaef
                  MATRIX: 977->18|1104->50|1132->52|1192->85|1220->86|1266->105|1294->106|1322->107|1369->129|1393->145|1432->147|1461->150|2071->755|2112->832|2154->847|2188->865|2228->867|2269->880|2320->904|2330->905|2357->911|2409->936|2419->937|2448->945|2500->970|2510->971|2546->986|2598->1011|2608->1012|2638->1021|2697->1053|2745->1080|2811->1115|2840->1133|2879->1144
                  LINES: 28->2|33->2|35->4|35->4|35->4|35->4|35->4|35->4|36->5|36->5|36->5|37->6|58->27|59->28|61->30|61->30|61->30|62->31|63->32|63->32|63->32|64->33|64->33|64->33|65->34|65->34|65->34|66->35|66->35|66->35|67->36|67->36|69->38|69->38|70->39
                  -- GENERATED --
              */
          