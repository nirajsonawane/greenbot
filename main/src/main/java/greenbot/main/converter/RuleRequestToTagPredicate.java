/*
 * Copyright 2019-2020 Vinay Lodha (https://github.com/vinay-lodha)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package greenbot.main.converter;

import greenbot.provider.predicates.TagPredicate;
import greenbot.rule.model.RuleRequest;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

/**
 * @author Vinay Lodha
 */
@Component
public class RuleRequestToTagPredicate implements Converter<RuleRequest, TagPredicate> {
    @Override
    public TagPredicate convert(RuleRequest source) {
        return TagPredicate.builder()
                .includedTag(source.getIncludedTag())
                .excludedTag(source.getExcludedTag())
                .build();
    }

}
