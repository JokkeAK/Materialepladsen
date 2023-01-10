import java.math.BigDecimal

data class ProductModel(
    val productGroup: String,
    val id: Int,
    val productArticleNumber: String,
    val productArticleName: String,
    val productSize: String,
    val productWeight: Int,
    val productPriceExTAX: BigDecimal,
    val productPriceInTAX: BigDecimal,
    val unit: String,
    val availability: String,
    val productImage: String,
    val productDescription : String
)