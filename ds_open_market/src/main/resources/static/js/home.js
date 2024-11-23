$(document).ready(function() {
    // 페이지 로드시 상품 리스트 불러오기
    loadItems();
});

function loadItems() {
    $.ajax({
        url: "./api/item/list",
        type: "GET",
        success: function(items) {
            console.log("상품 데이터 요청 성공:", items); // 더 자세한 로그
            
            if (!items || items.length === 0) {
                console.log("상품 데이터가 비어있음");
                $('.product-list').html('<p style="text-align: center; padding: 20px;">등록된 상품이 없습니다.</p>');
                return;
            }
            
            let html = '';
            items.forEach(function(item) {
                const discountedPrice = Math.floor(item.price * (100 - item.discount_rate) / 100);
                
                html += `
                    <div class="product-item">
                        <img src="${item.item_img_url || './image/default_profile.png'}" onerror="this.src='./image/default_profile.png'"/>
                        <div class="product-info">
                            <span class="product-name">${item.name || '상품명 없음'}</span>
                            <span class="product-content">${item.content}</span>
                            <del class="product-price">${(item.price || 0).toLocaleString()} 원</del>
                            <div>
                                <span class="product-discount">${item.discount_rate || 0}%</span>
                                <span class="product-discount-price">${discountedPrice.toLocaleString()} 원</span>
                            </div>
                            <span class="product-point">맴버십 포인트 ${(item.m_rate || 0).toLocaleString()}원 적립 가능</span>
                        </div>
                    </div>
                `;
            });
            $('.product-list').html(html);
        },
        error: function(e) {
            console.error("상품 목록 로드 실패:", e);
            $('.product-list').html('<p style="text-align: center; color: red; padding: 20px;">상품 목록을 불러오는데 실패했습니다.</p>');
        }
    });
}
