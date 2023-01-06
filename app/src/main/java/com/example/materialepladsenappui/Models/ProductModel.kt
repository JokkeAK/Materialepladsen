data class ProductModel(
    val productGroup: String,
    val id: Long,
    val productArticleNumber: String,
    val productArticleName: String,
    val productSize: String,
    val productWeight: Double,
    val productPriceExTAX: Double,
    val productPriceInTAX: Double,
    val unit: String,
    val availability: Boolean,
    val productImage: String
)